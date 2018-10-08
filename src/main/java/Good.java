import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Good {
    private static final Logger log = LoggerFactory.getLogger(Good.class);
    private String foo;

    private String bar;

    public Good() {
    }

    public String getFoo() {
        return this.foo;
    }

    public String getBar() {
        return this.bar;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Good)) return false;
        final Good other = (Good) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$foo = this.getFoo();
        final Object other$foo = other.getFoo();
        if (this$foo == null ? other$foo != null : !this$foo.equals(other$foo)) return false;
        final Object this$bar = this.getBar();
        final Object other$bar = other.getBar();
        if (this$bar == null ? other$bar != null : !this$bar.equals(other$bar)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $foo = this.getFoo();
        result = result * PRIME + ($foo == null ? 43 : $foo.hashCode());
        final Object $bar = this.getBar();
        result = result * PRIME + ($bar == null ? 43 : $bar.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Good;
    }

    public String toString() {
        return "Good(foo=" + this.getFoo() + ", bar=" + this.getBar() + ")";
    }
}
