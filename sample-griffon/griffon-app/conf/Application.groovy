application {
    title = 'SampleGriffon'
    startupGroups = ['sample-griffon']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "sample-griffon"
    'sample-griffon' {
        model      = 'sample.griffon.SampleGriffonModel'
        view       = 'sample.griffon.SampleGriffonView'
        controller = 'sample.griffon.SampleGriffonController'
    }

}
