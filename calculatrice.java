public class calculatrice {
    public float _x;
    public float _y;

    public calculatrice(float x,float y){
        _x = x;
        _y = y;
    }
    public float addition(){
        return _x+_y;
    }
    public float soustraction(){
        return _x-_y;
    }
    public float multiplication(){
        return _x*_y;
    }
    public float division(){
        return _x/_y;
    }
}
