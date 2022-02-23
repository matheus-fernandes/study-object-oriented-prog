package patterns.template.repository;

import patterns.template.validation.NotValid;

import java.util.Collection;

import static java.lang.System.out;

public abstract class Repository <T> {

    public void save(T register){
        Collection<NotValid> notValidCollection =
                this.findNotValid(register);

        if (notValidCollection.isEmpty()) {
            this.prepare(register);
            this.flush(register);
        }
        else {
            notifyInvalidation(notValidCollection);
        }
    }

    private void notifyInvalidation(Collection<NotValid> notValidCollection){
        notValidCollection.forEach(notValid -> out.println(notValid.get()));
    }

    protected abstract Collection<NotValid> findNotValid(T register);
    protected abstract void prepare(T register);
    protected abstract void flush(T register);
}
