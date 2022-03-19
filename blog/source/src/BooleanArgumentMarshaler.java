import java.util.Iterator;
import java.util.ListIterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {

    boolean booleanValue = false;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }

    public static boolean getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof BooleanArgumentMarshaler) {
            return ((BooleanArgumentMarshaler) am).booleanValue;
        } else {
            return false;
        }
    }
}
