import java.util.Objects;

public class Object {
    private String name;
    private int age;

    /**
     * 默认比较地址，如果地址相同则对象相等。可重写来覆盖判断
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Object)) return false;
        Object object = o;
        return age == object.age &&
                Objects.equals(name, object.name);
    }


}
