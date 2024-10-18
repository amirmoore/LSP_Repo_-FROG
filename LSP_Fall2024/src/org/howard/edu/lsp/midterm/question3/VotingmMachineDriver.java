package org.howard.edu.lsp.midterm.question3;

public class VotingmMachineDriver {
	public static void main(String[] args) {
        //  instance of VotingMachine
        VotingMachine vm = new VotingMachine();

        // test candidate
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

        // cast candidate
        vm.castVote("Alsobrooks");
        vm.castVote("Alsobrooks");

        // query candidate
        System.out.println(vm.toString());
    }
}
