package o_o_p_constructor;

public class ConstructorSample {
    private int height = 1;
    private int width = 1;

    public ConstructorSample(int h, int w) {
        setHeight(h);
        setWidth(w);

    }

    public void setHeight(int h) {
        if (h > 0) height = h;
    }

    public void setWidth(int w) {
        if (w > 0) width = w;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}