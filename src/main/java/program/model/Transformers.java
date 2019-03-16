package program.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class Transformers {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @UniqueElements
  private String nazwa;

  @NotNull
  @Pattern(regexp = "#[0-9]")
  private int mocZnamionowa;

  @NotNull
  private float napiecieDolne;

  @NotNull
  private float napiecieGorne;

  @NotNull
  @Range(min=0, max=100)
  private float napiecieZwarcia;

  @NotNull
  private String grupaPolaczen;

  @NotNull
  @Pattern(regexp = "#[0-9]")
  private float stratyJalowe;

  @NotNull
  @Pattern(regexp = "#[0-9]")
  private float stratyObciazeniowe;

  private String producent;

  public Transformers() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public int getMocZnamionowa() {
    return mocZnamionowa;
  }

  public void setMocZnamionowa(int mocZnamionowa) {
    this.mocZnamionowa = mocZnamionowa;
  }

  public float getNapiecieDolne() {
    return napiecieDolne;
  }

  public void setNapiecieDolne(float napiecieDolne) {
    this.napiecieDolne = napiecieDolne;
  }

  public float getNapiecieGorne() {
    return napiecieGorne;
  }

  public void setNapiecieGorne(float napiecieGorne) {
    this.napiecieGorne = napiecieGorne;
  }

  public float getNapiecieZwarcia() {
    return napiecieZwarcia;
  }

  public void setNapiecieZwarcia(float napiecieZwarcia) {
    this.napiecieZwarcia = napiecieZwarcia;
  }

  public String getGrupaPolaczen() {
    return grupaPolaczen;
  }

  public void setGrupaPolaczen(String grupaPolaczen) {
    this.grupaPolaczen = grupaPolaczen;
  }

  public float getStratyJalowe() {
    return stratyJalowe;
  }

  public void setStratyJalowe(float stratyJalowe) {
    this.stratyJalowe = stratyJalowe;
  }

  public float getStratyObciazeniowe() {
    return stratyObciazeniowe;
  }

  public void setStratyObciazeniowe(float stratyObciazeniowe) {
    this.stratyObciazeniowe = stratyObciazeniowe;
  }

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
  }
}
