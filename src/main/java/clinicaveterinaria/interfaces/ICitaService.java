package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Cita;
import java.util.List;

public interface ICitaService {
    void crearCita(Cita cita);
    Cita obtenerCita(int id);
    void cancelarCita(int id);
    List<Cita> generarReporteCitasPorVeterinario(int veterinarioId);
}
