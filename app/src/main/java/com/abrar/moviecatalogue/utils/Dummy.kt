package com.abrar.moviecatalogue.utils

import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.movies.domain.models.MovieResponse
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel

object Dummy {
    fun generateDataMovieDummyResponse(): List<MovieResponse> {
        val listMovie = ArrayList<MovieResponse>()

        listMovie.add(
            MovieResponse(
                id = 1,
                title = "A Star Is Born",
                overview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally\\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                posterPath = "https://image.tmdb.org/t/p/original/wqtaHWOEZ3rXDJ8c6ZZShulbo18.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/wqtaHWOEZ3rXDJ8c6ZZShulbo18.jpg",
                releaseDate = null,
                titleDetail = "A Star Is Born",
                vote = 7.5
            )
        )

        listMovie.add(
            MovieResponse(
                id = 2,
                title = "Alita: Battle Angel",
                overview = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                posterPath = "https://image.tmdb.org/t/p/original/aQXTw3wIWuFMy0beXRiZ1xVKtcf.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/aQXTw3wIWuFMy0beXRiZ1xVKtcf.jpg",
                releaseDate = null,
                titleDetail = "Alita: Battle Angel",
                vote = 7.2,
            )
        )

        listMovie.add(
            MovieResponse(
                id = 3,
                title = "Aquaman",
                overview = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm\\'s half-human, half-Atlantean brother and true heir to the throne.",
                posterPath = "https://image.tmdb.org/t/p/original/4IWnPqNu34zY4ku3LQJw56MIHFc.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/4IWnPqNu34zY4ku3LQJw56MIHFc.jpg",
                releaseDate = null,
                titleDetail = "Aquaman",
                vote = 6.9
            )
        )

        listMovie.add(
            MovieResponse(
                id = 4,
                title = "Bohemian Rhapsody",
                overview = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock \\'n\\' roll band Queen in 1970. Hit songs become instant classics. When Mercury\\'s increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                posterPath = "https://image.tmdb.org/t/p/original/xcaSYLBhmDzJ6P14bcKe0KTh3QV.jpgc",
                backdropPath = "https://image.tmdb.org/t/p/original/xcaSYLBhmDzJ6P14bcKe0KTh3QV.jpgc",
                releaseDate = null,
                titleDetail = "Bohemian Rhapsody",
                vote = 8.0,
            )
        )

        listMovie.add(
            MovieResponse(
                id = 5,
                title = "Cold Pursuit",
                overview = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son\\'s murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking\\'s associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                posterPath = "https://image.tmdb.org/t/p/original/XAvFHWmWjBeJUQEHBbCcXvzdDZ.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/XAvFHWmWjBeJUQEHBbCcXvzdDZ.jpg",
                releaseDate = null,
                vote = 7.5,
               titleDetail = "Cold Pursuit"
            )
        )

        listMovie.add(
            MovieResponse(
                id = 6,
                title = "Creed II",
                titleDetail = "Creed II",
                overview = "Between personal obligations and training for his next big fight against an opponent with ties to his family\\'s past, Adonis Creed is up against the challenge of his life.",
                posterPath = "https://image.tmdb.org/t/p/original/7568G5PAdQweNfTiuwzlssOxueB.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/7568G5PAdQweNfTiuwzlssOxueB.jpg",
                releaseDate = null,
                vote = 6.9,
            )
        )

        listMovie.add(
            MovieResponse(
                id = 7,
                title = "Fantastic Beasts: The Crimes of Grindelwald",
                titleDetail = "Fantastic Beasts: The Crimes of Grindelwald",
                overview = "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                posterPath = "https://image.tmdb.org/t/p/original/heyvaoVLGC8lcB4FFoz65EBI8xF.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/heyvaoVLGC8lcB4FFoz65EBI8xF.jpg",
                releaseDate = null,
                vote = 6.9,
            )
        )

        listMovie.add(
            MovieResponse(
                id = 8,
                title = "Glass",
                titleDetail = "Glass",
                overview = "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                posterPath = "https://image.tmdb.org/t/p/original/ngBFDOsx13sFXiMweDoL54XYknR.jpg",
                releaseDate = null,
                vote = 6.7,
                backdropPath = "https://image.tmdb.org/t/p/original/ngBFDOsx13sFXiMweDoL54XYknR.jpg",
            )
        )

        listMovie.add(
            MovieResponse(
                id = 9,
                title = "How to Train Your Dragon: The Hidden World",
                titleDetail = "How to Train Your Dragon: The Hidden World",
                posterPath = "https://image.tmdb.org/t/p/original/h3KN24PrOheHVYs9ypuOIdFBEpX.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/h3KN24PrOheHVYs9ypuOIdFBEpX.jpg",
                releaseDate = null,
                vote = 7.0,
                overview = "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            )
        )

        listMovie.add(
            MovieResponse(
                id = 10,
                title = "Avengers: Infinity War",
                titleDetail = "Avengers: Infinity War",
                overview = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                releaseDate = null,
                vote = 8.2,
                posterPath = "https://image.tmdb.org/t/p/original/kbGO5mHPK7rh516MgAIJUQ9RvqD.jpg",
                backdropPath = "https://image.tmdb.org/t/p/original/kbGO5mHPK7rh516MgAIJUQ9RvqD.jpg"
            )
        )

        return listMovie
    }
    fun generateDataMovieDummy(): List<MovieModel> {
        val listMovie = ArrayList<MovieModel>()

        listMovie.add(
            MovieModel(
                id = 1,
                title = "A Star Is Born",
                desc = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally\\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                poster = "R.drawable.poster_a_start_is_born",
                image_preview = "https://image.tmdb.org/t/p/original/wqtaHWOEZ3rXDJ8c6ZZShulbo18.jpg",
                releaseDate = null,
                genre = "Drama, Percintaan, Musik",
                duration = "2h 16m",
                userScore = 7.5,
                language = "Inggris",
                director = "Bradley Cooper",
                screenplay = "Bradley Cooper, Will Fetters, Eric Roth",
                stories = "Robert Carson, William A. Wellman",
                budget = "$36,000,000.00",
                income = "$433,888,866.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 2,
                title = "Alita: Battle Angel",
                desc = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                poster = "R.drawable.poster_alita",
                image_preview = "https://image.tmdb.org/t/p/original/aQXTw3wIWuFMy0beXRiZ1xVKtcf.jpg",
                releaseDate = null,
                genre = "Aksi, Cerita Fiksi, Petualangan",
                duration = "2h 2m",
                userScore = 7.2,
                language = "Inggris",
                director = "Robert Rodriguez",
                screenplay = "James Cameron, Laeta Kalogridis",
                stories = "-",
                budget = "$170,000,000.00",
                income = "$404,852,543.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 3,
                title = "Aquaman",
                desc = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm\\'s half-human, half-Atlantean brother and true heir to the throne.",
                poster = "R.drawable.poster_aquaman",
                image_preview = "https://image.tmdb.org/t/p/original/4IWnPqNu34zY4ku3LQJw56MIHFc.jpg",
                releaseDate = null,
                genre = "Aksi, Petualangan, Fantasi\n",
                duration = "2h 23m",
                userScore = 6.9,
                language = "Inggris",
                director = "James Wan",
                screenplay = "David Leslie Johnson-McGoldrick",
                stories = "James Wan, Will Beall, Geoff Johns",
                budget = "$160,000,000.00",
                income = "$1,148,461,807.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 4,
                title = "Bohemian Rhapsody",
                desc = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock \\'n\\' roll band Queen in 1970. Hit songs become instant classics. When Mercury\\'s increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                poster = "R.drawable.poster_bohemian",
                image_preview = "https://image.tmdb.org/t/p/original/xcaSYLBhmDzJ6P14bcKe0KTh3QV.jpgc",
                releaseDate = null,
                genre = "Musik, Drama, Sejarah",
                duration = "2h 15m",
                userScore = 8.0,
                language = "Inggris",
                director = "Bryan Singer",
                screenplay = "Anthony McCarten, Peter Morgan",
                stories = "Anthony McCarten",
                budget = "$52,000,000.00",
                income = "$894,027,543.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 5,
                title = "Cold Pursuit",
                desc = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son\\'s murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking\\'s associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                poster = "R.drawable.poster_cold_persuit",
                image_preview = "https://image.tmdb.org/t/p/original/XAvFHWmWjBeJUQEHBbCcXvzdDZ.jpg",
                releaseDate = null,
                genre = "Aksi, Kejahatan, Cerita Seru",
                duration = "1h 59m",
                userScore = 7.5,
                language = "",
                director = "Hans Petter Moland",
                screenplay = "Frank Baldwin",
                stories = "-",
                budget = "$60,000,000.00",
                income = "$76,419,755.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 6,
                title = "Creed II",
                desc = "Between personal obligations and training for his next big fight against an opponent with ties to his family\\'s past, Adonis Creed is up against the challenge of his life.",
                poster = "R.drawable.poster_creed",
                image_preview = "https://image.tmdb.org/t/p/original/7568G5PAdQweNfTiuwzlssOxueB.jpg",
                releaseDate = null,
                genre = "Drama",
                duration = "2h 10m",
                userScore = 6.9,
                language = "Inggris",
                director = "Steven Caple Jr.",
                screenplay = "Sylvester Stallone, Juel Taylor",
                stories = "Sascha Penn, Cheo Hodari Coker",
                budget = "$50,000,000.00",
                income = "$214,215,889.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 7,
                title = "Fantastic Beasts: The Crimes of Grindelwald",
                desc = "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                poster = "R.drawable.poster_crimes",
                image_preview = "https://image.tmdb.org/t/p/original/heyvaoVLGC8lcB4FFoz65EBI8xF.jpg",
                releaseDate = null,
                genre = "Petualangan, Fantasi, Drama",
                duration = "2m",
                userScore = 6.9,
                language = "inggris",
                director = "David Yates",
                screenplay = "J.K. Rowling",
                stories = "-",
                budget = "$200,000,000.00",
                income = "$653,355,901.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 8,
                title = "Glass",
                desc = "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                poster = "R.drawable.poster_glass",
                image_preview = "https://image.tmdb.org/t/p/original/ngBFDOsx13sFXiMweDoL54XYknR.jpg",
                releaseDate = null,
                genre = "Cerita Seru, Drama, Cerita Fiksi",
                duration = "2h 9m",
                userScore = 6.7,
                language = "Inggris",
                director = "M. Night Shyamalan",
                screenplay = "M. Night Shyamalan",
                stories = "-",
                budget = "$20,000,000.00",
                income = "$246,941,965.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 9,
                title = "How to Train Your Dragon: The Hidden World",
                desc = "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                poster = "R.drawable.poster_how_to_train",
                image_preview = "https://image.tmdb.org/t/p/original/h3KN24PrOheHVYs9ypuOIdFBEpX.jpg",
                releaseDate = null,
                genre = "Animasi, Keluarga, Petualangan",
                duration = "1h 44m",
                userScore = 7.8,
                language = "Inggris",
                director = "Dean DeBlois",
                screenplay = "Dean DeBlois",
                stories = "Dean DeBlois",
                budget = "$129,000,000.00",
                income = "$517,526,875.00",
                status = "rilis"
            )
        )

        listMovie.add(
            MovieModel(
                id = 10,
                title = "Avengers: Infinity War",
                desc = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                poster = "R.drawable.poster_infinity_war",
                image_preview = "https://image.tmdb.org/t/p/original/kbGO5mHPK7rh516MgAIJUQ9RvqD.jpg",
                releaseDate = null,
                genre = "Petualangan, Aksi, Cerita Fiksi",
                duration = "2h 29m",
                userScore = 8.3,
                language = "Inggris",
                director = "Anthony Russo, Joe Russo",
                screenplay = "Christopher Markus, Stephen McFeely",
                stories = "-",
                budget = "$300,000,000.00",
                income = "$2,046,239,637.00",
                status = "rilis"
            )
        )

        return listMovie
    }

    fun generateDataTvShowDummy(): List<TvShowModel> {
        val listTvShow = ArrayList<TvShowModel>()

        listTvShow.add(
            TvShowModel(
                id = 1,
                title = "Arrow",
                desc = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                poster = "R.drawable.poster_arrow"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 2,
                title = "Doom Patrol",
                desc = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                poster = "R.drawable.poster_doom_patrol"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 3,
                title = "Dragon Ball",
                desc = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he titled Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl titled Bulma, whose search for the mystical Dragon Balls brought her to Goku\\'s home. Together, they set off to find all seven and to grant her wish.",
                poster = "R.drawable.poster_dragon_ball"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 4,
                title = "Fairy Tail",
                desc = "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\\'t just any ordinary kid, he\\'s a member of one of the world\\'s most infamous mage guilds: Fairy Tail.",
                poster = "R.drawable.poster_fairytail"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 5,
                title = "Family Guy",
                desc = "Sick, twisted, politically incorrect and Freakin\\' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he\\'s not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                poster = "R.drawable.poster_family_guy"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 6,
                title = "The Flash",
                desc = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion — and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won\\'t be long before the world learns what Barry Allen has become…The Flash.",
                poster = "R.drawable.poster_flash"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 7,
                title = "NCIS",
                desc = "Is an American police procedural television series, revolving around a fictional team of special agents from the Naval Criminal Investigative Service combining elements of the military drama and police procedural genres.",
                poster = "R.drawable.poster_ncis"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 8,
                title = "Gotham",
                desc = "Everyone knows the title Commissioner Gordon. He is one of the crime world\\'s greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon\\'s story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world\\'s most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                poster = "R.drawable.poster_gotham"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 9,
                title = "Grey\\'s Anatomy",
                desc = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                poster = "R.drawable.poster_grey_anatomy"
            )
        )

        listTvShow.add(
            TvShowModel(
                id = 10,
                title = "Hanna",
                desc = "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                poster = "R.drawable.poster_hanna"
            )
        )

        return listTvShow
    }
}