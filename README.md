# Calculadora EJB

Implementación de una calculadora remota haciendo uso de un EJB de tipo _session stateful_ que sea capaz de recordar el histórico de valores previos calculados e implemente la siguiente interfaz:

```java
public interface CalculadoraBeanRemote {
  public float sumar(float sumando1, float sumando2);
  public float restar(float minuendo, float sustraendo);
  public float multiplicar(float factor1, float factor2);
  public float dividir(float dividendo, float divisor);
  public List<Float> consultar();
}
```

---

[**Contactar Desarrollador**](mailto:davidac0291@gmail.es?subject=[EJB]%20Duda%20Calculadora)
