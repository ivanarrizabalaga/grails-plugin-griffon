package sample.griffon
import sampleg.SampleEnum
import sampleg.RegularClazz
import sampleg.domain.Book

application(title: 'sample-griffon',
  preferredSize: [320, 240],
  pack: true,
  //location: [50,50],
  locationByPlatform: true,
  iconImage:   imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    // add content here
    vbox{
      label("Using enums: ${SampleEnum.VALUE1}")    
      Book b= new Book(title:"Lallala",author:"Hhhhhh")
      label("Using domain: ${b}")    
      label("Using src: ${new RegularClazz().helloWorld()}")
    }
    
}
