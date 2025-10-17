package spring.boot.desafio.rafadevgg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import spring.boot.desafio.rafadevgg.entity.enums.TipoDocumento;

import java.time.LocalDate;

@Entity
@Table(name = "TB_Documento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class DocumentoModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDocumento")
    private TipoDocumento tipoDocumento;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "dataInclusão")
    private LocalDate dataInclusao;

    @Column(name = "dataAtualização")
    private LocalDate dataAtualizacao;
}
