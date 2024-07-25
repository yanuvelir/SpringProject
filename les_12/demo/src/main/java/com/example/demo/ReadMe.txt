Внедрение зависимостей должно проходить через конструктор -
//    @Autowired
//    public MyController(Teacher teacher) {
//
//        this.teacher = teacher;
//    }

Если такой возможности нет, то можно применять и методы (сеттеры)

@Autowired
    public void testMethod(Teacher teacher) {
        this.teacher = teacher;
    }

    @Autowired
        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }