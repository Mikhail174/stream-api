package optional;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class Utils {
    public static Optional<String> getManagerName (Employee emp) {
        return Optional.ofNullable(emp)
                .map(Employee::getDepartment);
    }

    public static String getString () {
        return Instant.now().toString();
    }

    public static String getStringNull () {
        return null;
    }

    public static Optional<Optional<String>> getOptionalOPtional () {
        return Optional.of(Optional.of("BadString"));
    }

    public static Optional<Employee> optionalForFilter () {
        return Optional.of(new Employee("1","2","3"));
    }
}
