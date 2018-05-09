
package br.edu.ifro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class aluno {
 @Id
 @GeneratedValue

 
 private Integer id;
 private String nome;  
}
