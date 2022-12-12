package main.java.ru.gb.oopseminar.view;
import java.util.logging.Logger;


public class StudyGroupView {
    public void SendStudyGrouppOnConcole (StringBuilder studyGroup ) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info(studyGroup.toString());
    }
}
    

