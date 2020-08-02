package com.nitin.friendsquizapp

object Constants {
    const val  USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Who is this in real life? ",
            R.drawable.ic_frone,
            "Jennifer Anniston",
            "Courteney Cox Arquette",
            "Lisa Kudrow",
            "Monica Geller",
            2
        )

        questionsList.add(que1)
        val que2 = Question(
            2,
            "What was the name of the guy that Brad Pitt played? ",
            R.drawable.ic_frtwo,
            "Will Coulter ",
            "Lance David",
            "Lance Davis",
            "Will Colbert",
            4
        )

        questionsList.add(que2)

        val que3 = Question(
            3 ,
            "Who did she work for? ",
            R.drawable.ic_frthree,
            "Monica",
            "Ross",
            "Chandler",
            "Joey",
            4
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What was the name of Rachel's ex-fiance? ",
            R.drawable.ic_frfour,
            "Barry",
            "Larry",
            "Gary",
            "Gerry",
            1
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "Who's girlfriend was this? ",
            R.drawable.ic_frfive,
            "Joey",
            "Chandler",
            "Ross",
            "Richard",
            3
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "Match this picture to the correct episode:",
            R.drawable.ic_frsix,
            "The One with the Ballroom Dancing",
            "The One with the Morning After",
            "The One with Ross's Thing",
            "The One without the Ski Trip",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "Match this picture to the correct episode: ",
            R.drawable.ic_frseven,
            "The One with Chandler's Work Laugh",
            "The One where Everyone Finds Out",
            "The One with the Kips",
            "The One with Joey's Bag",
            4
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "Match this picture to the correct episode: ",
            R.drawable.ic_freight,
            "The One with the Halloween Party",
            "The One with Joey's Interview",
            "The One with the Vows",
            "The One where Chandler Takes a Bath",
            2
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "Match this picture to the correct episode: ",
            R.drawable.ic_frnine,
            "The One where Joey Speaks French",
            "The One with the Donor",
            "The One with Ross's Tan",
            "The One where Chandler Gets Caught",
            3
        )

        questionsList.add(que9)

        val que10 = Question(
            10,
            "Match this picture to the correct episode: ",
            R.drawable.ic_frten,
            "The One with Rachel's Going Away Party",
            "The One with the Last One Part 1",
            "The One with the Last One Part 2",
            "The One with Princess Consuela",
            3
        )

        questionsList.add(que10)


        return questionsList

    }
}