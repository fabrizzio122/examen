package pe.edu.fab.mscurso.Service;

import pe.edu.fab.mscurso.Entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService
{
    List<Curso> listar();
    Optional<Curso> buscarPorId(Integer id);
    Curso guardar(Curso categoria);
    Curso actualizar(Curso categoria);
    void borrarPorId(Integer id);
}
