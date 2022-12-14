/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */

package listmanager



class App {
     companion object {
        @JvmStatic
        fun main(args: Array<String>) {
    

            var newApp = App()

            println("--------Inital Data in list manager------")
            newApp.ListManager!!.OutputEntries()
            println()

            println("-------Adding entries test-----------")
            newApp.ListManager!!.AddItem(PhoneItem("Douglas", "e56-T", 2022))
            newApp.ListManager!!.AddItem(PhoneItem("CS 3680", "kotlin-list-manager", 2023))
            newApp.ListManager!!.OutputEntries()
            println()

            println("---------Getting entry at index = 2 ( 0 based ) ---------")
            var data = newApp.ListManager!!.GetItemByID(2)
            print(data!!.asString())
            println()
            println()

            println("-------Removing entry at index = 2 ( 0 based )-----------")
            newApp.ListManager!!.DeleteItem(2)
            newApp.ListManager!!.OutputEntries()
            println()

        }
    }

    var ListManager : IManager? = ManagerImpl(
"""Samsung;S20+;2020;
Apple;iPhone 13;2021;
Samsung;Note 3;2014;
Apple;Iphone 4s;2012;
Samsung;S8+;2018;
Apple;iPhone 5c;2013;
Samsung;A17;2017;
Samsung;Flip 3; 2018;
Apple;iPhone X; 2018;
Apple;iPhone 8 Plus;2016;
Nokia;G100;2022;
Blackberry;Curve 8520;2009""")


    val greeting: String
        get() {
            return "Hello World!"
        }

    
}

