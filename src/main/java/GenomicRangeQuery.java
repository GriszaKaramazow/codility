/**
 * A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types
 * of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of
 * types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of
 * the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
 *
 * The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M
 * queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M)
 * requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K]
 * and Q[K] (inclusive).
 *
 * For example, consider string S = CAGCCTA and arrays P, Q such that:
 *
 *     P = [2, 5, 0]
 *     Q = [4, 5, 6]
 *
 * The answers to these M = 3 queries are as follows:
 *
 * The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2
 * respectively, so the answer is 2. The part between positions 5 and 5 contains a single nucleotide T, whose impact
 * factor is 4, so the answer is 4. The part between positions 0 and 6 (the whole string) contains all nucleotides, in
 * particular nucleotide A whose impact factor is 1, so the answer is 1.
 * Write a function that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q
 * consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.
 *
 * Result array should be returned as an array of integers.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * M is an integer within the range [1..50,000];
 * each element of arrays P, Q is an integer within the range [0..N − 1];
 * P[K] ≤ Q[K], where 0 ≤ K < M;
 * string S consists only of upper-case English letters A, C, G, T.
 */
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] adenineArray = new int[S.length() + 1];
        int[] cytosineArray = new int[S.length() + 1];
        int[] guanineArray = new int[S.length() + 1];
        int adenineCount = 0;
        int cytosineCount = 0;
        int guanineCount = 0;
        adenineArray[0] = adenineCount;
        cytosineArray[0] = cytosineCount;
        guanineArray[0] = guanineCount;
        char[] nucleotides = S.toCharArray();
        for (int i = 0; i < nucleotides.length; i++) {
            if (nucleotides[i] == 'A') {
                adenineCount++;
            } else if (nucleotides[i] == 'C') {
                cytosineCount++;
            } else if (nucleotides[i] == 'G') {
                guanineCount++;
            }
            adenineArray[i + 1] = adenineCount;
            cytosineArray[i + 1] = cytosineCount;
            guanineArray[i + 1] = guanineCount;
        }
        for (int i = 0; i < P.length; i++) {
            if (adenineArray[Q[i] + 1] - adenineArray[P[i]] > 0) {
                P[i] = 1;
            } else if (cytosineArray[Q[i] + 1] - cytosineArray[P[i]] > 0) {
                P[i] = 2;
            } else if (guanineArray[Q[i] + 1] - guanineArray[P[i]] > 0) {
                P[i] = 3;
            } else {
                P[i] = 4;
            }
        }
        return P;
    }

}
