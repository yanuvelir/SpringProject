13 lesson - Внедрение зависимостей должно проходить через конструктор -
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

 14 lesson - в старых проектах могут использовать поле как зависимость

    @Autowired
    private Teacher teacher;

  15th lesson - have been learned the @Qualifier annotation. This annotation necessary to point to one
   of the bean. For example, we have several methods/beans and for correct run a code necessary
    to define any method as  @Qualifier.

                 @Autowired
                    public MyController(@Qualifier("laborTeacher") Teacher teacher) {

                        this.teacher = teacher;
                    }

    16th lesson