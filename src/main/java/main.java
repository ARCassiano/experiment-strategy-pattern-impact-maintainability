import com.mycompany.strategyexperiment.dao.experiment.AnexoFullDAO;
import com.mycompany.strategyexperiment.dao.experiment.DAOConstrutores;
import com.mycompany.strategyexperiment.dao.experiment.DAOFactory;

public class main {

    public static void main(String[] args) {
       AnexoFullDAO anexoFullDAO = (AnexoFullDAO) DAOFactory.ofFullDAO(DAOConstrutores.ANEXO_FULLDAO);
    }
}
