import SwiftUI
import shared

struct ContentView: View {
	let greet = DaysWithoutBadHabitsViewModel(dayIterator: DayIteratorImpl(dateTimeRepository: DateTimeRepositoryImpl(dataTimePreferences: DataTimePreferencesImpl())

                                                                           
	var body: some View {
    )
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
