package sevenKyu

/*
Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.

@ @@ @ @@ @ @@ @ @@ @ @@ @

If there are less than 2 blue beads return 0.
 */

fun countRedBeads(nBlue: Int): Int {
    return if (nBlue < 2) 0 else {
        (nBlue - 1) * 2
    }
}