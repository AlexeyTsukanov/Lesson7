package com.company.lesson17;

public class MinMax {
    public static void main(String[] args) {
        Integer array[] = {1, 2, 3, 0, 4, 5};
        MinMaxFound<?> minFound = new MinMaxFound<>(array);
        minFound.foundMin();
        minFound.foundMux();
    }

    static class MinMaxFound<T extends Number> {
        T[] obg;

        MinMaxFound(T[] obg) {
            this.obg = obg;
        }

        public T[] getObg() {
            return obg;
        }

        public void setObg(T obg[]) {
            this.obg = obg;
        }

        public void foundMin() {
            T min = obg[0];
            for (int i = 0; i < obg.length - 1; i++) {
                if (obg[i].intValue() > obg[i + 1].intValue()) {
                    min = obg[i + 1];
                }
            }
            System.out.println(min);
        }

        public void foundMux() {
            T min = obg[0];
            for (int i = 0; i < obg.length - 1; i++) {
                if (obg[i].intValue() < obg[i + 1].intValue()) {
                    min = obg[i + 1];
                }
            }
            System.out.println(min);
        }
    }
}
