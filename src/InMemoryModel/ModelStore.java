package InMemoryModel;

import ModelElements.PoligonalModel;
import ModelElements.Flash;
import ModelElements.Camera;
import ModelElements.Scene;


import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObserver;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras,
                      List<IModelChangedObserver> changeObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changedObserver = changeObservers;
    }


    public Scene getScene(int id) {
        return scenes.stream()
                .filter(scene -> scene.id == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
