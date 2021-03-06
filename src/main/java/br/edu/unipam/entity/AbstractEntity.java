package br.edu.unipam.entity;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author celsojunio11
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipam.entity;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author celsojunio11
 */
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public Date getDataCriacao() {
        return DataCriacao;
    }
    public void setDataCriacao(Date DataCriacao) {
        this.DataCriacao = DataCriacao;
    }
    public Date getDataAlteracao() {
        return DataAlteracao;
    }
    public void setDataAlteracao(Date DataAlteracao) {
        return DataCriacao;
    }
    public void setDataCriacao(Date DataCriacao) {
        this.DataCriacao = DataCriacao;
    }
    public Date getDataAlteracao() {
        return DataAlteracao;
    }
    public void setDataAlteracao(Date DataAlteracao) {
        this.DataAlteracao = DataAlteracao;
    }

    @Temporal(TemporalType.DATE)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date DataCriacao;

    @Temporal(TemporalType.DATE)
    @Temporal(TemporalType.TIME)
    protected Date DataAlteracao;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
}
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
}