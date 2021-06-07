public class Hideout<T> {
    private T element;

    public Hideout() {
        this.element = null;
    };

    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }

    public T takeFromHideout() {
        if (this.element instanceof String) {
            T old = this.element;
            this.element = null;
            return old;
        }
        return null;
    }

    public boolean isInHideout() {
        if (this.element instanceof String) {
            return true;
        }
        return false;
    }
}
