package domain.mapper.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "TB_Beneficiario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class BeneficiarioModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "dataNascimento")
    private LocalDate dataNascimento;

    @OneToMany
    @JoinColumn(name = "dataInclusao", referencedColumnName = "dataInclusao")
    private DocumentoModel diDocumento;

    @OneToMany
    @JoinColumn(name = "dataAtualizacao", referencedColumnName = "dataAtualizacao")
    private DocumentoModel dtDocumento;

}
