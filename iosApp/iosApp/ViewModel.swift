//
//class Viem : ObservableObject{
//    
//    @Published var phraseTextView = "not load"
//    @Published var imageView = MR.images.shared.image_one
//
//    let sharedViewModel = DailyBlissViewModel(dailyBlissInteractor: DailyBlissInteractorImpl(imagesRepository: ImageRepositoryImpl(), phraseRepository: PhraseRepositoryImpl(), daysSinceAppInstallIteractor: DaysSinceAppInstallIteractorImpl(dateTimeRepository: DateTimeRepositoryImpl(dataTimePreferences: DataTimePreferencesImpl()))))
//    
//    lazy var coroutinesAdapter = CoroutinesAdapter()
//    
//    func load() {
//        coroutinesAdapter.collect(flow: sharedViewModel.phraseAndImage) { (phraseAndImage) in
//            let pair = phraseAndImage as! KotlinPair<ResourcesImageResource, ResourcesStringDesc>
//            self.imageView = pair.first!
//            self.phraseTextView = (pair.second?.localized())!
//        }
//    }
//    
//    func destroy() {
//        sharedViewModel.onCleared()
//    }
//}
