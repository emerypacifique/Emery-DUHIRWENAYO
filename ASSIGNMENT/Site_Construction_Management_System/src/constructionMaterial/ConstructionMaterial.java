package constructionMaterial;

public abstract class ConstructionMaterial {
    /*  Abstract Methods:
        receiveMaterial() – For processing delivered materials.
        useMaterial() – For handling consumption of materials.
        estimateCost() – For calculating cost based on usage. */

    public abstract void receiveMaterial();
    public abstract void useMaterial();
    public abstract  void estimateCost();
}
