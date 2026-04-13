# Stackers

<img src="apps/stackers/androidApp/src/main/ic_launcher-playstore-dark.png" width="100" height="100"><img src="apps/stackers/androidApp/src/main/ic_launcher-playstore.png" width="100" height="100">

Stackers is a modern Kotlin Multiplatform (KMP) application designed to browse and search for Stack Overflow users using the official Stack Exchange API. Built with a focus on performance, scalability, and a consistent experience across Android and iOS, the app leverages the latest Android development best practices adapted for multiplatform use.

### Supported Platforms
|                    Android                     |                    iOS                     |
|:----------------------------------------------:|:------------------------------------------:|
|  <img src="./docs/android.gif" width="50%" />  |  <img src="./docs/ios.gif" width="50%" />  |

### Key Features
- User Discovery: Browse a paginated list of Stack Overflow users directly from the home screen.
- Advanced Search: Search for specific users by name with real-time results, utilizing debouncing and distinct filtering to optimize API usage.
- Detailed Profiles: View comprehensive user information, including reputation, badge counts (gold, silver, bronze), account age, and location.
- Offline Support: Integrated with Room and Paging3 (RemoteMediator) to provide a seamless offline-first experience, caching user data locally for instant access.