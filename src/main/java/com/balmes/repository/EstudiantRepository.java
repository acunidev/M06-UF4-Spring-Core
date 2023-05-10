package com.balmes.repository;

import com.balmes.model.Curs;
import com.balmes.model.Estudiant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EstudiantRepository implements CrudRepository<Estudiant> {

  public List<Estudiant> findAll() {
    // TODO Auto-generated method stub
    List<Estudiant> estudiantList = new ArrayList<>();
    CursRepository cursRepository = new CursRepository();
    final List<Curs> allCursos = cursRepository.findAll();
    estudiantList.add(new Estudiant(1, "Ahmad", "Bryden", allCursos.get(1)));
    estudiantList.add(new Estudiant(2, "Web", "Dreier", allCursos.get(1)));
    estudiantList.add(new Estudiant(3, "Ardisj", "Abramowitch", allCursos.get(1)));
    estudiantList.add(new Estudiant(4, "Laurena", "Abrahami", allCursos.get(1)));
    estudiantList.add(new Estudiant(5, "Jacinthe", "Hancox", allCursos.get(1)));
    estudiantList.add(new Estudiant(6, "Nadeen", "Veregan", allCursos.get(1)));
    estudiantList.add(new Estudiant(7, "Jonas", "Beedell", allCursos.get(0)));
    estudiantList.add(new Estudiant(8, "Delcina", "Sesnane", allCursos.get(1)));
    estudiantList.add(new Estudiant(9, "Orazio", "Rey", allCursos.get(1)));
    estudiantList.add(new Estudiant(10, "Alonzo", "Cundey", allCursos.get(0)));
    return estudiantList;
  }

  public List<Estudiant> getEstudiantsperCurs(int cursId) {
    List<Estudiant> estudiantList = findAll();
    List<Estudiant> estudiantsPerCurs = new ArrayList<>();

    for (Estudiant estudiant : estudiantList) {
      if (estudiant.getCurs().getCursId() == cursId) {
        estudiantsPerCurs.add(estudiant);
      }
    }

    return estudiantsPerCurs;

  }
}
