import sampleg.SampleEnum
import com.nortia.sample.Other

class Library {
	static void main(String [] args){
		println SampleEnum.VALUE1
		Other o= new Other(name:"Pepe")
		println "Other: ${o.name}"
	}
}
