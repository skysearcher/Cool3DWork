package CodeFiles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua on 3/5/2016.
 */
public class TownModel {
    private List models;

    public TownModel(){
        models = new ArrayList<>();
    }
    public void addModel(WireFrame model){
        models.add(model);
    }
    public List getModels(){
        return models;
    }
}
