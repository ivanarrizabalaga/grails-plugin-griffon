import sampleg.SampleEnum
import sampleg.RegularClazz
import sampleg.domain.Book

class Library {
	static void main(String [] args){
		println "==>${SampleEnum.VALUE1}"
		Book b= new Book(title:"Lallala",author:"Hhhhhh")
		println "==>$b"
		println "==>${new RegularClazz().helloWorld()}"
	}
}
