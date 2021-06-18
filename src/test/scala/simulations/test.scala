package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Test extends Simulation
{
  val httpProtocol = http
    .baseUrl("https://aspire-log-stage.azurewebsites.net")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.106 Safari/537.36")

  val headers_0 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7",
    "content-type" -> "application/json",
    "origin" -> "https://aspire-log-stage.azurewebsites.net",
    "sdk-context" -> "appId",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_1 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_2 = Map(
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_5 = Map(
    "Origin" -> "https://aspire-log-stage.azurewebsites.net",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_9 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin")

  val headers_10 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7",
    "pragma" -> "no-cache",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_109 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7",
    "content-type" -> "application/json; charset=utf-8",
    "origin" -> "https://aspire-log-stage.azurewebsites.net",
    "sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-requestverificationtoken" -> "CfDJ8MmVDGrngqFGqPtKyk88E2wg5KQduKR-CaoZaK8FI_HfEb2sXZ7Ef5oMzysMPBE_XRRou5VZ9yqe1BHbFheFEA7jvFEKxPjLIhiDgVPlO7IeoFz-47W7ag6-Nu-dnN7SafQYgQAU4X7SWxP0ySp_vAS0UJvoVMylMzoVhdEAuoFcQ9UJ6wd-WGbDCHiJK_YYHw")

  val uri1 = "https://dc.cux.io/analyzer.js"
  val uri2 = "https://aspirelogstage.blob.core.windows.net/storage"
  val uri3 = "https://az416426.vo.msecnd.net/scripts/a/ai.0.js"
  val uri4 = "https://dc.services.visualstudio.com/v2/track"

  val scn = scenario("RecordedSimulation")
    .exec(http("request_0")
      .post(uri4)
      .headers(headers_0)
      .body(RawFileBody("recordedsimulation/0000_request.json"))
      .resources(http("request_1")
        .get("/home")
        .headers(headers_1),
        http("request_2")
          .get("/bundles/v2/js/app.26613fac.js")
          .headers(headers_2),
        http("request_3")
          .get("/bundles/v2/js/chunk-vendors.aa3d971e.js")
          .headers(headers_2),
        http("request_4")
          .get(uri1)
          .headers(headers_2),
        http("request_5")
          .get("/bundles/v2/fonts/SourceSansPro-BlackVersion.0ef6054e.otf")
          .headers(headers_5),
        http("request_6")
          .get("/bundles/v2/fonts/SourceSansPro-Bold.269ca7e4.otf")
          .headers(headers_5),
        http("request_7")
          .get("/bundles/v2/fonts/SourceSansPro-Regular.d6cd4777.otf")
          .headers(headers_5),
        http("request_8")
          .get("/bundles/v2/fonts/log-icons.b6043a59.ttf")
          .headers(headers_5),
        http("request_9")
          .get("/api/theme")
          .headers(headers_9),
        http("request_10")
          .get("/bundles/v2/favicons/favicon.ico")
          .headers(headers_10),
        http("request_11")
          .get("/api/users/self/status")
          .headers(headers_9),
        http("request_12")
          .get("/api/geeks/csrf-token")
          .headers(headers_9),
        http("request_13")
          .get("/api/geeks/self")
          .headers(headers_9),
        http("request_14")
          .get("/api/users/appInsights")
          .headers(headers_9),
        http("request_15")
          .get(uri2 + "/Themes/default/log-logo-md.png")
          .headers(headers_2),
        http("request_16")
          .get(uri2 + "/Themes/default/log-text-md.png")
          .headers(headers_2),
        http("request_17")
          .get("/bundles/v2/img/g-coin.dde59f9b.svg")
          .headers(headers_2),
        http("request_18")
          .get(uri2 + "/Themes/default/log-background-2020.png")
          .headers(headers_2),
        http("request_19")
          .get("/bundles/v2/img/bg-attributes-sprite-active.1fe9123b.png")
          .headers(headers_2),
        http("request_20")
          .get("/bundles/v2/img/bg-attributes-sprite.a3990dde.png")
          .headers(headers_2),
        http("request_21")
          .get(uri3)
          .headers(headers_2),
        http("request_22")
          .get("/api/guides/pending")
          .headers(headers_9),
        http("request_23")
          .get("/api/geeks/self/basic-info")
          .headers(headers_9),
        http("request_24")
          .get("/api/geeks/self/latest-accomplishment")
          .headers(headers_9),
        http("request_25")
          .get("/api/geeks/self/general-position")
          .headers(headers_9),
        http("request_26")
          .get("/api/news?limit=3")
          .headers(headers_9),
        http("request_27")
          .get("/api/activities/recent?skill=general&limit=18")
          .headers(headers_9),
        http("request_28")
          .get("/api/opportunities/newest?limit=6")
          .headers(headers_9),
        http("request_29")
          .get(uri2 + "/Images/Geeks/superduper.admin.png")
          .headers(headers_2),
        http("request_30")
          .get("/bundles/v2/icons/badges/silver-born-speaker-md.png")
          .headers(headers_2),
        http("request_31")
          .get(uri2 + "/Images/News/cf3972db-099c-4cc8-40e9-08d930e2b615/en-US%5C2ce022c0-7661-4ab4-b9a9-9e0d112c2712_.png")
          .headers(headers_2),
        http("request_32")
          .get(uri2 + "/Images/News/OpportunityFinalizedNewsImage.png")
          .headers(headers_2),
        http("request_33")
          .get(uri2 + "/Images/Geeks/maja3.janowska.png")
          .headers(headers_2),
        http("request_34")
          .get("/bundles/v2/icons/activities/changer-lg.png")
          .headers(headers_2),
        http("request_35")
          .get("/bundles/v2/icons/activities/positive-behavior-lg.png")
          .headers(headers_2),
        http("request_36")
          .get(uri2 + "/Images/Geeks/maja.janowska2.png")
          .headers(headers_2),
        http("request_37")
          .get("/bundles/v2/icons/activities/feedback-lg.png")
          .headers(headers_2),
        http("request_38")
          .get(uri2 + "/Images/Geeks/opportunity.candidate3.png")
          .headers(headers_2),
        http("request_39")
          .get("/bundles/v2/icons/activities/conference-lg.png")
          .headers(headers_2),
        http("request_40")
          .get("/bundles/v2/icons/subactivities/conference-two-days-md.png")
          .headers(headers_2),
        http("request_41")
          .get("/bundles/v2/icons/activities/external-training-lg.png")
          .headers(headers_2),
        http("request_42")
          .get("/bundles/v2/icons/activities/internal-activities-lg.png")
          .headers(headers_2),
        http("request_43")
          .get(uri2 + "/Images/Geeks/opportunity.approver2.png")
          .headers(headers_2),
        http("request_44")
          .get(uri2 + "/Images/Geeks/opportunity.candidate6.png")
          .headers(headers_2),
        http("request_45")
          .get("/bundles/v2/icons/activities/exam-lg.png")
          .headers(headers_2),
        http("request_46")
          .get("/bundles/v2/icons/activities/solution-lg.png")
          .headers(headers_2),
        http("request_47")
          .get(uri2 + "/Images/Geeks/office.admin2.png")
          .headers(headers_2),
        http("request_48")
          .get("/bundles/v2/icons/activities/code-review-lg.png")
          .headers(headers_2),
        http("request_49")
          .get("/bundles/v2/icons/activities/pizza-meeting-lg.png")
          .headers(headers_2),
        http("request_50")
          .get("/api/notifications")
          .headers(headers_9)))
    .pause(4)
    .exec(http("request_51")
      .get("/home")
      .headers(headers_1)
      .resources(http("request_52")
        .get("/bundles/v2/js/app.26613fac.js")
        .headers(headers_2),
        http("request_53")
          .get("/bundles/v2/js/chunk-vendors.aa3d971e.js")
          .headers(headers_2),
        http("request_54")
          .get("/bundles/v2/css/chunk-vendors.1ca2e074.css")
          .headers(headers_2),
        http("request_55")
          .get("/bundles/v2/css/app.fafafc28.css")
          .headers(headers_2),
        http("request_56")
          .get("/bundles/v2/fonts/SourceSansPro-BlackVersion.0ef6054e.otf")
          .headers(headers_5),
        http("request_57")
          .get("/bundles/v2/fonts/SourceSansPro-Bold.269ca7e4.otf")
          .headers(headers_5),
        http("request_58")
          .get("/bundles/v2/fonts/SourceSansPro-Regular.d6cd4777.otf")
          .headers(headers_5),
        http("request_59")
          .get("/bundles/v2/fonts/log-icons.b6043a59.ttf")
          .headers(headers_5),
        http("request_60")
          .get(uri1)
          .headers(headers_2),
        http("request_61")
          .get("/api/theme")
          .headers(headers_9),
        http("request_62")
          .get("/bundles/v2/favicons/favicon.ico")
          .headers(headers_10),
        http("request_63")
          .get("/api/users/self/status")
          .headers(headers_9),
        http("request_64")
          .get("/api/geeks/csrf-token")
          .headers(headers_9),
        http("request_65")
          .get("/api/geeks/self")
          .headers(headers_9),
        http("request_66")
          .get("/api/users/appInsights")
          .headers(headers_9),
        http("request_67")
          .get(uri2 + "/Themes/default/log-logo-md.png")
          .headers(headers_2),
        http("request_68")
          .get(uri2 + "/Themes/default/log-text-md.png")
          .headers(headers_2),
        http("request_69")
          .get("/bundles/v2/img/g-coin.dde59f9b.svg")
          .headers(headers_2),
        http("request_70")
          .get(uri2 + "/Themes/default/log-background-2020.png")
          .headers(headers_2),
        http("request_71")
          .get("/bundles/v2/img/bg-attributes-sprite-active.1fe9123b.png")
          .headers(headers_2),
        http("request_72")
          .get("/bundles/v2/img/bg-attributes-sprite.a3990dde.png")
          .headers(headers_2),
        http("request_73")
          .get(uri3)
          .headers(headers_2),
        http("request_74")
          .get("/api/guides/pending")
          .headers(headers_9),
        http("request_75")
          .get("/api/geeks/self/latest-accomplishment")
          .headers(headers_9),
        http("request_76")
          .get("/bundles/v2/icons/badges/silver-born-speaker-md.png")
          .headers(headers_2),
        http("request_77")
          .get("/api/activities/recent?skill=general&limit=18")
          .headers(headers_9),
        http("request_78")
          .get("/api/geeks/self/basic-info")
          .headers(headers_9),
        http("request_79")
          .get("/api/geeks/self/general-position")
          .headers(headers_9),
        http("request_80")
          .get("/api/news?limit=3")
          .headers(headers_9),
        http("request_81")
          .get(uri2 + "/Images/Geeks/maja3.janowska.png")
          .headers(headers_2),
        http("request_82")
          .get("/bundles/v2/icons/activities/changer-lg.png")
          .headers(headers_2),
        http("request_83")
          .get("/bundles/v2/icons/activities/positive-behavior-lg.png")
          .headers(headers_2),
        http("request_84")
          .get(uri2 + "/Images/Geeks/maja.janowska2.png")
          .headers(headers_2),
        http("request_85")
          .get("/bundles/v2/icons/activities/feedback-lg.png")
          .headers(headers_2),
        http("request_86")
          .get(uri2 + "/Images/Geeks/opportunity.candidate3.png")
          .headers(headers_2),
        http("request_87")
          .get("/bundles/v2/icons/activities/conference-lg.png")
          .headers(headers_2),
        http("request_88")
          .get("/bundles/v2/icons/subactivities/conference-two-days-md.png")
          .headers(headers_2),
        http("request_89")
          .get(uri2 + "/Images/Geeks/superduper.admin.png")
          .headers(headers_2),
        http("request_90")
          .get("/bundles/v2/icons/activities/external-training-lg.png")
          .headers(headers_2),
        http("request_91")
          .get("/bundles/v2/icons/activities/internal-activities-lg.png")
          .headers(headers_2),
        http("request_92")
          .get(uri2 + "/Images/Geeks/opportunity.approver2.png")
          .headers(headers_2),
        http("request_93")
          .get(uri2 + "/Images/Geeks/opportunity.candidate6.png")
          .headers(headers_2),
        http("request_94")
          .get("/bundles/v2/icons/activities/exam-lg.png")
          .headers(headers_2),
        http("request_95")
          .get("/bundles/v2/icons/activities/solution-lg.png")
          .headers(headers_2),
        http("request_96")
          .get("/api/opportunities/newest?limit=6")
          .headers(headers_9),
        http("request_97")
          .get(uri2 + "/Images/Geeks/office.admin2.png")
          .headers(headers_2),
        http("request_98")
          .get("/bundles/v2/icons/activities/code-review-lg.png")
          .headers(headers_2),
        http("request_99")
          .get("/bundles/v2/icons/activities/pizza-meeting-lg.png")
          .headers(headers_2),
        http("request_100")
          .get("/api/notifications")
          .headers(headers_9),
        http("request_101")
          .get(uri2 + "/Images/News/cf3972db-099c-4cc8-40e9-08d930e2b615/en-US%5C2ce022c0-7661-4ab4-b9a9-9e0d112c2712_.png")
          .headers(headers_2),
        http("request_102")
          .get(uri2 + "/Images/News/OpportunityFinalizedNewsImage.png")
          .headers(headers_2)))
    .pause(1)
    .exec(http("request_103")
      .get("/bundles/v2/img/bg-attributes-sprite-hover.04f53f4c.png")
      .headers(headers_2))
    .pause(2)
    .exec(http("request_104")
      .get("/api/opportunities/counters")
      .headers(headers_9)
      .resources(http("request_105")
        .get("/api/opportunities/tags")
        .headers(headers_9),
        http("request_106")
          .get("/api/opportunities/drafts")
          .headers(headers_9),
        http("request_107")
          .get("/api/opportunities/tags/most-popular")
          .headers(headers_9),
        http("request_108")
          .get("/api/opportunities/creators")
          .headers(headers_9),
        http("request_109")
          .post("/api/opportunities/search?limit=20")
          .headers(headers_109)
          .body(RawFileBody("recordedsimulation/0109_request.json"))))
    .pause(1)
    .exec(http("request_110")
      .get("/api/opportunities/drafts/d4146b61-5727-4512-3160-08d7d565cf87")
      .headers(headers_9))
    .pause(1)
    .exec(http("request_111")
      .get("/api/opportunities/departments")
      .headers(headers_9)
      .resources(http("request_112")
        .get("/api/opportunities/roles/approvers")
        .headers(headers_9),
        http("request_113")
          .get("/api/opportunities/levels")
          .headers(headers_9),
        http("request_114")
          .get(uri2 + "/Themes/default/LoG-default-avatar.png")
          .headers(headers_2),
        http("request_115")
          .get(uri2 + "/Images/Geeks/opportunity.approver3.png")
          .headers(headers_2),
        http("request_116")
          .get(uri2 + "/Images/Geeks/opportunity.admin1.png")
          .headers(headers_2),
        http("request_117")
          .get("/api/opportunities/drafts/d4146b61-5727-4512-3160-08d7d565cf87")
          .headers(headers_9),
        http("request_118")
          .get("/api/opportunities/tags")
          .headers(headers_9)))
    .pause(5)
    .exec(http("request_119")
      .post(uri4)
      .headers(headers_0)
      .body(RawFileBody("recordedsimulation/0119_request.json"))
      .resources(http("request_120")
        .put("/api/opportunities/drafts/d4146b61-5727-4512-3160-08d7d565cf87")
        .headers(headers_109)
        .body(RawFileBody("recordedsimulation/0120_request.json")),
        http("request_121")
          .get("/api/opportunities/drafts/d4146b61-5727-4512-3160-08d7d565cf87")
          .headers(headers_9)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}