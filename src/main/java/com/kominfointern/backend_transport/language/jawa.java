package com.kominfointern.backend_transport.language;

public class jawa {
    public static final java.io.PrintStream say = System.out;
    public static String Jaring(Object input) {
        return String.valueOf(input);
    }
    public static class LarikKarakter {
        private final String val;
        public LarikKarakter(String val) { this.val = val; }
        @Override public String toString() { return val; }
    }

    // Integer replacement
    public static class wilangan {
        private final int val;
        public wilangan(int val) { this.val = val; }
        public int get() { return val; }
    }
}
