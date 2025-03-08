package asteroids_caravan.model;

import java.time.LocalDate;

public class SearchHistory {

    private int idSearchHistory;
    private LocalDate surveyDay;

    public int getIdSearchHistory() {
        return idSearchHistory;
    }
    public void setIdSearchHistory(int idSearchHistory) {
        this.idSearchHistory = idSearchHistory;
    }
    public LocalDate getSurveyDay() {
        return surveyDay;
    }
    public void setSurveyDay(LocalDate surveyDay) {
        this.surveyDay = surveyDay;
    }
    

}
