import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            int n = fs.nextInt();
 
            int idx = 0;
 
            for (int i = 1; i <= 2 * n; i += 2) {
                out.append(i);
                idx++;
                if (idx < n) out.append(' ');
                if (idx == n) break;
            }
 
            for (int i = 2; idx < n; i += 2) {
                out.append(i);
                idx++;
                if (idx < n) out.append(' ');
            }
 
            out.append('\n');
        }
 
        System.out.print(out);
    }
 
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
 
        FastScanner(InputStream is) {
            in = is;
        }
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }
 
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
 
            return val;
        }
    }
}