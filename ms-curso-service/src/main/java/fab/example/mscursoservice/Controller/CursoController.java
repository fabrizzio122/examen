package fab.example.mscursoservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fab.example.mscursoservice.Entity.Curso;
import fab.example.mscursoservice.Service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService CursoService;

    @GetMapping
    public List<Curso> listar() {
        return CursoService.listar();
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(@PathVariable Integer id) {
        return CursoService.buscarPorId(id).get();
    }

    @PostMapping
    public Curso guardar(Curso curso) {
        return CursoService.guardar(curso);
    }

    @PutMapping
    public Curso actualizar(Curso curso) {
        return CursoService.actualizar(curso);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        CursoService.borrarPorId(id);
        return "Categoria eliminada";
    }
}
