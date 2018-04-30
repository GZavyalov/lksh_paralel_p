package  keyval


fun main(args: Array<String>){

    val prefs_val = "glebandkotlin"


    val list:ArrayList<KeyValModel> = ArrayList();

    while (true){
        print("Choose mode(1 - add new key-val data, 2 - get value with key or key with value): ")
        val mode:Int = readLine()!!.toInt();
        if(mode == 1){
            val key = readLine()!!.toString();
            val valuee = readLine()!!.toString();
            val model = KeyValModel()
            model.key = key;
            model.valuee = valuee;
            list.add(model);
            print("Element with the key " + key + " and value " + valuee + " was added.")
        }else if(mode == 2){
            print("If you want to find value with a key type 1, if you want to find key with a value type 2: ")
            val mode2: Int = readLine()!!.toInt();
            if(mode2 == 1){
                print("Type your key: ")
                val key2: String = readLine()!!.toString();
                val ii = list.size;

                for(i in 0..ii-1){
                    val modell:KeyValModel = list.get(i);
                    if(modell.key == key2){
                        println("Your value: " + modell.valuee);
                    }
                }
            }else if(mode2 == 2){
                print("Type your value: ")
                val value2: String = readLine()!!.toString();
                val ii = list.size;

                for(i in 0..ii-1){
                    val modell:KeyValModel = list.get(i);
                    if(modell.valuee == value2){
                        println("Your key: " + modell.key);
                    }
                }
            }
        }


    }




}

data class KeyValModel(val count: Int = 0){

    var key:String = ""
    var valuee:String = ""
}