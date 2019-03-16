package program.model;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SystemEE {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @UniqueElements
  private String nazwa;

  @NotNull
  private int mocZwarciowa;

  @NotNull
  private float napiecieGorne;

  @NotNull
  private float napiecieDolne;

  @NotNull
  private float wspolczynnikC;

  public SystemEE() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getMocZwarciowa() {
    return mocZwarciowa;
  }

  public void setMocZwarciowa(int mocZwarciowa) {
    this.mocZwarciowa = mocZwarciowa;
  }

  public float getNapiecieGorne() {
    return napiecieGorne;
  }

  public void setNapiecieGorne(float napiecieGorne) {
    this.napiecieGorne = napiecieGorne;
  }

  public float getNapiecieDolne() {
    return napiecieDolne;
  }

  public void setNapiecieDolne(float napiecieDolne) {
    this.napiecieDolne = napiecieDolne;
  }

  public float getWspolczynnikC() {
    return wspolczynnikC;
  }

  public void setWspolczynnikC(float wspolczynnikC) {
    this.wspolczynnikC = wspolczynnikC;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }
}
