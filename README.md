# ClinicaVeterinaria

taller de refactoring SOLID en java, cada uno trabajo en una rama

## como correr

```
mvn compile
java -cp target/classes clinicaveterinaria.Main
```

tiene que salir: `=== ClinicaVeterinaria funcionando ===`

---

## integrante 1 - SRP

Veterinario tenia metodos para reservar, diagnosticar, facturar y reportes, eso no tiene sentido en un modelo. los movi a los servicios que ya existian.

archivos cambiados: Veterinario.java, ReporteService.java, Main.java

| que se revisa | ok |
|---|---|
| compila | si |
| Veterinario ya no hace cosas que no son suyas | si |
| el Main sigue funcionando | si |

---

## integrante 2 - OCP

Tratamiento usaba switch por tipo para calcular costos. hice una clase por cada tipo que implementa ITratamiento, asi no hay que tocar nada si se agrega uno nuevo.

archivos cambiados: VacunaTratamiento.java, CirugiaTratamiento.java, MedicamentoTratamiento.java, FisioterapiaTratamiento.java, TratamientoService.java, Main.java

| que se revisa | ok |
|---|---|
| compila | si |
| no hay switch gigante | si |
| cada tratamiento sabe su costo | si |

---

## integrante 3 - LSP

Animal tenia volar nadar y caminar, el Pez heredaba caminar y tiraba excepcion. separe eso en interfaces: Caminador, Nadador, Volador. cada animal solo implementa lo que puede hacer. tambien borre IAnimal que no se usaba.

archivos cambiados: Animal.java, Perro.java, Gato.java, Pajaro.java, Pez.java, interfaces nuevas

| que se revisa | ok |
|---|---|
| compila | si |
| ningun animal hace lo que no puede | si |
| no hay UnsupportedOperationException | si |

---

## integrante 4 - ISP y DIP

IServicioClinica tenia como 15 metodos y RecepcionService implementaba la mitad con excepciones. dividi la interfaz en partes mas chicas. tambien Clinica y GestorReportesClinica ya no crean sus dependencias con new adentro, las reciben por constructor.

archivos cambiados: IMascotaService.java, ICitaService.java, IFacturaService.java, IReporteService.java, RecepcionService.java, Clinica.java, GestorReportesClinica.java, Main.java

| que se revisa | ok |
|---|---|
| compila | si |
| RecepcionService no tiene metodos que no usa | si |
| Clinica recibe dependencias por constructor | si |
