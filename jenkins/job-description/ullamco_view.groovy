 
listView('ullamco Jobs') {
    description('ullamco Jobs')
    jobs {
        regex('ullamco_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
