package com.PracticeRIPTutorial;

public class Team {
    Member member;

    public Team(Member member) { // who is in this team?
        this.member = member; // one "member" in this team
        // one team member because to have more we need to use help of ARRAY

    }

    public static void main(String[] args) {
        // above created our main method

        Member myMember = new Member("Auriieel", "light",10,1);
        Team myTeam = new Team (myMember);

        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}
    class Member{
        private String name;
        private String type;
        private int level; // note the data type here
        private int rank; // note the date type here as well


        /*using private access modifiers prevents outside entities from accessing
         your variable*/

        public Member(String name, String type, int level, int rank) {
            this.name = name;
            this.type = type;
            this.level = level;
            this.rank = rank;

        }
// lets define our getter functions here
        public String getName(){
            return this.name;
        }
        public String getType(){
            return this.type;
        }
        public int getLevel(){
            return this.level;
        }
        public int getRank(){
            return this.rank;
        }
    }

