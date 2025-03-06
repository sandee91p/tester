package lu.die.foza.SleepyFox;

public final class ྈ<L, R> extends ႀ<L, R> {
   public static final long Ԩ = 4954918890077093841L;
   public final L left;
   public final R right;

   public static <L, R> ྈ<L, R> of(L var0, R var1) {
      return new ྈ(var0, var1);
   }

   public ྈ(L var1, R var2) {
      this.left = var1;
      this.right = var2;
   }

   public L getLeft() {
      return this.left;
   }

   public R getRight() {
      return this.right;
   }

   public R setValue(R var1) {
      throw new UnsupportedOperationException();
   }
}
