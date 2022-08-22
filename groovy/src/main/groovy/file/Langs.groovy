package file

//对应xml中的langs结点
class Langs {
    String type = 'current'
    int count = 3
    boolean mainstream = true
    def languages = [
            new Language(flavor: 'static',
                    version: '1.5', value: 'Java'),
            new Language(flavor: 'dynamic',
                    version: '1.3', value: 'Groovy'),
            new Language(flavor: 'dynamic',
                    version: '1.6', value: 'JavaScript')
    ]
}






