package com.kominfointern.backend_transport.language;

import jakarta.persistence.GenerationType;

public class jawa {
    public static final GenerationType BIRTH_ID = GenerationType.IDENTITY;



    public static final java.io.PrintStream say = System.out;
    public static String Jaring(Object input) {
        return String.valueOf(input);
    }
    public static class ꦯꦼꦫꦠꦤ꧀ {
        private final String val;
        public ꦯꦼꦫꦠꦤ꧀(String val) { this.val = val; }
        @Override public String toString() { return val; }
    }

    // Integer replacement
    public static class ꦮꦶꦭꦔꦤ꧀ {
        private final int val;
        public ꦮꦶꦭꦔꦤ꧀(int val) { this.val = val; }
        public int get() { return val; }
    }

    public static class ꦒꦸꦁ {
        private final long val;
        public ꦒꦸꦁ(long val) { this.val = val; }
        public long get() { return val; }
    }

}
