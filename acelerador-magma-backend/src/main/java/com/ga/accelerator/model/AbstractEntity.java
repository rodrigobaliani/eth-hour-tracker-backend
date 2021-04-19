package com.ga.accelerator.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@Where(clause = "deleted = false")
public abstract class AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
    @CreatedBy
    @Column(updatable = false)
    protected String createdBy;

    @CreatedDate
    @Column(updatable = false)
    protected Date creationDate;

    @LastModifiedBy
    protected String lastModifiedBy;

    @LastModifiedDate
    protected Date lastModifiedDate;
    
    @Setter(AccessLevel.NONE)
    private boolean deleted = false;

	public void setDeleted() {
		this.deleted = true;
	}


}
