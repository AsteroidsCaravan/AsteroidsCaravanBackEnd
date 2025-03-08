package asteroids_caravan.model;

public class SearchHistory {
    //IMPLEMENTAR ATRIBUTOS
    //IMPLEMENTAR GETTERS E SETTERS

    private int idSearchHistory;
    private DateTime surveyDay;
    
    public int getIdSearchHistory() {
        return idSearchHistory;
    }
    public void setIdSearchHistory(int idSearchHistory) {
        this.idSearchHistory = idSearchHistory;
    }
    public DateTime getSurveyDay() {
        return surveyDay;
    }
    public void setSurveyDay(DateTime surveyDay) {
        this.surveyDay = surveyDay;
    }

}
