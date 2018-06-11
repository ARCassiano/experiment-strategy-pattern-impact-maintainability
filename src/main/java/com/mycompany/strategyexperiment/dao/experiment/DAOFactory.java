package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.*;
import com.mycompany.strategyexperiment.dao.experiment.excluir.*;
import com.mycompany.strategyexperiment.dao.experiment.listar.*;
import com.mycompany.strategyexperiment.dao.experiment.salvar.*;

public class DAOFactory {

    public static AbstractFullDAO ofFullDAO(DAOConstrutores construtor) {
        switch (construtor) {
            case ANEXO_FULLDAO:
                return (new AnexoFullDAO(
                        new SalvarAnexo(),
                        new ListarAnexo(),
                        new BuscarAnexo(),
                        new ExcluirAnexo()));

            case ATAPARTICIPANTE_FULLDAO:
                return (new AtaParticipanteFullDAO(
                        new SalvarAtaParticipante(),
                        new ListarAtaParticipante(),
                        new BuscarAtaParticipante(),
                        new ExcluirAtaParticipante()));
            default:
                return null;
        }
    }

    public static AbstractSalvarBuscarDAO ofSalvarBuscarDAO(DAOConstrutores construtor) {
        switch (construtor) {
            case CAMPUS_SALVARBUSCARDAO:
                return (new CampusSalvarBuscarDAO(
                        new SalvarCampus(),
                        new BuscarCampus()
                ));

            case COMENTARIO_SALVARBUSCARDAO:
                return (new ComentarioSalvarBuscarDAO(
                        new SalvarComentario(),
                        new BuscarComentario()
                ));

            case DEPARTAMENTO_SALVARBUSCARDAO:
                return (new DepartamentoSalvarBuscarDAO(
                        new SalvarDepartamento(),
                        new BuscarDepartamento()
                ));
            default:
                return null;
        }
    }

    public static AbstractSalvarBuscarExcluirDAO ofSalvarBuscarExcluirDAO(DAOConstrutores construtor) {
        switch (construtor) {
            case PAUTA_SALVARBUSCAREXCLUIRDAO:
                return (new PautaSalvarBuscarExcluirDAO(
                        new SalvarPauta(),
                        new BuscarPauta(),
                        new ExcluirPauta()));
            default:
                return null;
        }
    }
}
