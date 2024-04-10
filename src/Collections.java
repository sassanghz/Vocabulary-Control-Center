package src;

import java.util.Collection;
import java.util.Iterator;

public abstract class Collections<T> implements Collection<T> {
    
    protected Collections() {}

    public abstract Iterator<T> iterator();

    public abstract int size();

    
    /** 
     * @return boolean
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    
    /** 
     * @param o
     * @return boolean
     */
    public boolean contains(Object o) {
        Iterator<T> it = iterator();
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return true;
        } else {
            while (it.hasNext())
                if (o.equals(it.next()))
                    return true;
        }
        return false;
    }

    
    /** 
     * @param obj
     * @return boolean
     */
    public boolean remove(Object obj) {
        Iterator<T> it = iterator();
        if (obj==null) {
            while (it.hasNext()) {
                if (it.next()==null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    
    /** 
     * @param collection
     * @return boolean
     */
    public boolean addAll(Collection<? extends T> collection) {
        boolean modified = false;
        for (T add : collection)
            if (add(add))
                modified = true;
        return modified;
    }

    /**
     * @return clear
     */

    public void clear() {
        Iterator<T> iterate = iterator();
        while (iterate.hasNext()) {
            iterate.next();
            iterate.remove();
        }
    }
}
